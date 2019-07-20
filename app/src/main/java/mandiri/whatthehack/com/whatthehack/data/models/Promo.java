package mandiri.whatthehack.com.whatthehack.data.models;

public class Promo {

    private String promoTitle, promoDetail, promoUrl;

    public Promo(String promoTitle, String promoDetail, String promoUrl) {
        this.promoTitle = promoTitle;
        this.promoDetail = promoDetail;
        this.promoUrl = promoUrl;
    }

    public String getPromoTitle() {
        return promoTitle;
    }

    public void setPromoTitle(String promoTitle) {
        this.promoTitle = promoTitle;
    }

    public String getPromoDetail() {
        return promoDetail;
    }

    public void setPromoDetail(String promoDetail) {
        this.promoDetail = promoDetail;
    }

    public String getPromoUrl() {
        return promoUrl;
    }

    public void setPromoUrl(String promoUrl) {
        this.promoUrl = promoUrl;
    }
}
