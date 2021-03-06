package com.oose2017.rshen3.hareandhounds.model;

public class PieceInfo {
    private String gameId;
    private String pieceType;
    private int x;
    private int y;

    public PieceInfo() {

    }

    public PieceInfo(String gameId, String pieceType, int x, int y) {
        this.gameId = gameId;
        this.pieceType = pieceType;
        this.x = x;
        this.y = y;
    }

    public PieceInfo(PieceInfo pieceInfo) {
        this.gameId = pieceInfo.getGameId();
        this.pieceType = pieceInfo.getPieceType();
        this.x = pieceInfo.getX();
        this.y = pieceInfo.getY();
    }
    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
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
