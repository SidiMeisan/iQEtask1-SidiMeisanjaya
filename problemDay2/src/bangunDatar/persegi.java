package bangunDatar;

public class persegi extends bangunDatar{
    float sisi;

    public float getLuas(float sisiBaru){
        this.sisi = sisiBaru;
        this.luas = this.sisi*this.sisi;
        return getLuas();
    }

    public float getKeliling(float sisiBaru){
        this.sisi = sisiBaru;
        this.keliling = this.sisi*4;
        return getKeliling();
    }
}
