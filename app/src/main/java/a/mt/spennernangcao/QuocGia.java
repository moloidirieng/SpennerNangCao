package a.mt.spennernangcao;

import java.io.Serializable;

public class QuocGia implements Serializable {
    private Integer mHinh;
    private String mTen;
    private int mToaDo;

    public Integer getmHinh() {
        return mHinh;
    }

    public void setmHinh(Integer mHinh) {
        this.mHinh = mHinh;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmToaDo() {
        return mToaDo;
    }

    public void setmToaDo(int mToaDo) {
        this.mToaDo = mToaDo;
    }

    public QuocGia() {
    }

    public QuocGia(Integer mHinh, String mTen, int mToaDo) {
        this.mHinh = mHinh;
        this.mTen = mTen;
        this.mToaDo = mToaDo;
    }
}
