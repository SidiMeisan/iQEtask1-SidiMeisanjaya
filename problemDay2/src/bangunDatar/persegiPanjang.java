package bangunDatar;

public class persegiPanjang extends bangunDatar{
    float panjang;
    float lebar;

    public float getLuas(float panjangBaru, float lebarBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.luas = this.panjang*this.lebar;
        return getLuas();
    }

    public float getKeliling(float panjangBaru, float lebarBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.keliling = (this.panjang*2)+(this.lebar*2);
        return getKeliling();
    }
}
