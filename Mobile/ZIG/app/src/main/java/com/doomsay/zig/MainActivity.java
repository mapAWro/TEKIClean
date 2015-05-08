package com.doomsay.zig;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.SQLException;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;


    public class MainActivity extends ActionBarActivity {

        public final static String EXTRA_MESSAGE = "You sir, suck";
        private final String LOG_TAG = getClass().getSimpleName();
        private ConnectionSource connectionSource;
        private Dao<SimpleData, Integer> simpleDao;
        private Dao<Account, String> accDao;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        public void superlogin(View v) {

            {
                if (connectionSource == null) {
                    try {
                        connectionSource =
                                new JdbcConnectionSource(
                                        "jdbc:mysql://zig-test.no-ip.org/tekicleandb");
                        accDao = DaoManager.createDao(connectionSource, Account.class);
                    } catch (SQLException e) {
                        throw new RuntimeException("Problems initializing database objects", e);
                    }
                    try {

                       TableUtils.createTable(connectionSource, Account.class);
                    } catch (SQLException e) {
                        // ignored atm
                    }
                }
            }

            final Button BLog = (Button) findViewById(R.id.button);
            final EditText Logtext = (EditText) findViewById(R.id.editText);
            final EditText Passtext = (EditText) findViewById(R.id.editText2);
            final TextView label = (TextView) findViewById(R.id.textView);

            try {
                //SELECT * FROM users
                // WHERE (name = login input AND password = password input)

                QueryBuilder<Account, String> queryBuilder = accDao.queryBuilder();
                // get the WHERE object to build our query
                Where<Account, String> where = queryBuilder.where();
                // the name field must be equal to Logtext.getText()
                where.eq(Account.LOGIN_FIELD_NAME, Logtext.getText().toString());
                // and
                where.and();
                // the password field must be equal to Passtext.getText()
                where.eq(Account.PASSWORD_FIELD_NAME, Passtext.getText().toString());
                PreparedQuery<Account> preparedQuery = queryBuilder.prepare();






            } catch (SQLException e) {
                //todo
            }

        }

        public void terminate(View v) {
            final Button Exit = (Button) findViewById(R.id.button4);
            finish();
            System.exit(0);
        }

        /**
         * Called when the user clicks the Send button
         */
        public void sendMessage(View v) {
            Intent intent = new Intent(this, Register.class);
            TextView label = (TextView) findViewById(R.id.textView);
            String message = label.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

    }
