package com.oose2017.rshen3.hareandhounds.model;

public class PieceInfoRet {

    private String pieceType;
    private int x;
    private int y;

    public PieceInfoRet() {

    }

    public PieceInfoRet(PieceInfo pieceInfo) {
        pieceType = pieceInfo.getPieceType();
        x = pieceInfo.getX();
        y = pieceInfo.getY();
    }

    public String getPieceType() {
        return pieceType;
    }

    public void setPieceType(String pieceType) {
        this.pieceType = pieceType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
