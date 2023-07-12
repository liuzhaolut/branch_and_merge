package liuzhao.lzpojo;

/**
 * @author 刘昭
 * 菜品实体类
 */
public class LzVegetableInfo {
    private int liuzhaoVegetableInfoID;
    private String liuzhaoVegetableName;
    private double liuzhaoVegetablePrice;
    private String liuzhaoVegetableMaterial;
    private String liuzhaoVegetableTaste;
    private String liuzhaoVegetablePhoto;

    @Override
    public String toString() {
        return "LzVegetableInfo{" +
                "liuzhaoVegetableInfoID=" + liuzhaoVegetableInfoID +
                ", liuzhaoVegetableName='" + liuzhaoVegetableName + '\'' +
                ", liuzhaoVegetablePrice=" + liuzhaoVegetablePrice +
                ", liuzhaoVegetableMaterial='" + liuzhaoVegetableMaterial + '\'' +
                ", liuzhaoVegetableTaste='" + liuzhaoVegetableTaste + '\'' +
                ", liuzhaoVegetablePhoto='" + liuzhaoVegetablePhoto + '\'' +
                '}';
    }

    public int getLiuzhaoVegetableInfoID() {
        return liuzhaoVegetableInfoID;
    }

    public void setLiuzhaoVegetableInfoID(int liuzhaoVegetableInfoID) {
        this.liuzhaoVegetableInfoID = liuzhaoVegetableInfoID;
    }

    public String getLiuzhaoVegetableName() {
        return liuzhaoVegetableName;
    }

    public void setLiuzhaoVegetableName(String liuzhaoVegetableName) {
        this.liuzhaoVegetableName = liuzhaoVegetableName;
    }

    public double getLiuzhaoVegetablePrice() {
        return liuzhaoVegetablePrice;
    }

    public void setLiuzhaoVegetablePrice(double liuzhaoVegetablePrice) {
        this.liuzhaoVegetablePrice = liuzhaoVegetablePrice;
    }

    public String getLiuzhaoVegetableMaterial() {
        return liuzhaoVegetableMaterial;
    }

    public void setLiuzhaoVegetableMaterial(String liuzhaoVegetableMaterial) {
        this.liuzhaoVegetableMaterial = liuzhaoVegetableMaterial;
    }

    public String getLiuzhaoVegetableTaste() {
        return liuzhaoVegetableTaste;
    }

    public void setLiuzhaoVegetableTaste(String liuzhaoVegetableTaste) {
        this.liuzhaoVegetableTaste = liuzhaoVegetableTaste;
    }

    public String getLiuzhaoVegetablePhoto() {
        return liuzhaoVegetablePhoto;
    }

    public void setLiuzhaoVegetablePhoto(String liuzhaoVegetablePhoto) {
        this.liuzhaoVegetablePhoto = liuzhaoVegetablePhoto;
    }

    public LzVegetableInfo() {

    }

    public LzVegetableInfo(int liuzhaoVegetableInfoID, String liuzhaoVegetableName, double liuzhaoVegetablePrice, String liuzhaoVegetableMaterial, String liuzhaoVegetableTaste, String liuzhaoVegetablePhoto) {
        this.liuzhaoVegetableInfoID = liuzhaoVegetableInfoID;
        this.liuzhaoVegetableName = liuzhaoVegetableName;
        this.liuzhaoVegetablePrice = liuzhaoVegetablePrice;
        this.liuzhaoVegetableMaterial = liuzhaoVegetableMaterial;
        this.liuzhaoVegetableTaste = liuzhaoVegetableTaste;
        this.liuzhaoVegetablePhoto = liuzhaoVegetablePhoto;
    }
}
