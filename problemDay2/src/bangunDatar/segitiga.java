package bangunDatar;

public class segitiga extends bangunDatar{
    float alas;
    float tinggi;
    float sisi;

    public float getLuas(float alasBaru, float tinggibaru) {
        this.alas = alasBaru;
        this.tinggi = tinggibaru;

        this.luas = (this.alas*this.tinggi)/2;
        return getLuas();
    }

    public float getKeliling(float alasBaru, float tinggibaru) {
        this.alas = alasBaru;
        this.tinggi = tinggibaru;

        this.sisi = (float) Math.sqrt(( Math.pow(this.alas,2) + Math.pow(this.tinggi,2)));

        this.keliling = this.alas+this.tinggi+this.sisi;
        return getKeliling();
    }
}
