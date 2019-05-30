package practice11;



public interface JoinKlass {
    //添加观察者
    void addObserver(Observer obj);

    //删除
    void deleteObserver(Observer obj);

    //主题方法改变时,这个方法被调用,通知所有的观察者
    void notifyObserver();
}
