package Sweeper;

class Flag {
    private Matrix flagMap;

    void start (){
        flagMap = new Matrix(Box.CLOSED);
    }

    Box get (Coord coord){
        return flagMap.get(coord);
    }
}
