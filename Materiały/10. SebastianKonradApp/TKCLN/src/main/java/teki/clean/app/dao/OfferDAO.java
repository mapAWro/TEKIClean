package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Offer;

public interface OfferDAO {
	public List<Offer> list();
	public Offer get(int offer_id);
	public void saveOrUpdate(Offer offer);
	public void delete(int offer_id);
}
