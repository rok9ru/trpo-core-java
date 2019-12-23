package core;
public  class LogAbstract  {
    protected  static LogAbstract instance;

    protected LogAbstract(){

    }
    /**
     * @return static
     */

    //так как instance у нас LogAbstract, нет смысла в том,
    //чтобы проверять instance, является ли он объектом класса LogAbstract
    public static LogAbstract getInstance() {
        if (instance == null) {
            instance = new LogAbstract(){};
        }
        return instance;
    }

    protected String[] log ;
    public void _write(){
    }


}
