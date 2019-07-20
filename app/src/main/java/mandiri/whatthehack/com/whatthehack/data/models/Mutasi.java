package mandiri.whatthehack.com.whatthehack.data.models;

public class Mutasi {

    private String imageUrl, transactionName, transactionValue;
    private boolean transactionType;

    public Mutasi(String imageUrl, String transactionName, String transactionValue, boolean transactionType) {
        this.imageUrl = imageUrl;
        this.transactionName = transactionName;
        this.transactionValue = transactionValue;
        this.transactionType = transactionType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(String transactionValue) {
        this.transactionValue = transactionValue;
    }

    public boolean isTransactionType() {
        return transactionType;
    }

    public void setTransactionType(boolean transactionType) {
        this.transactionType = transactionType;
    }
}
