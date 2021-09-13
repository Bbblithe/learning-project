#include <iostream>
using namespace std;

// 圆和点关系案例
// 圆类
class Point{
private:
    int x ;
    int y ;

public:
    void setX(int x0){
        x = x0;
    }

    void setY(int y0){
        y = y0;
    }

    int getX(){
        return x;
    }
    
    int getY(){
        return y;
    }
};

class Circle{
private:
    int R;
    Point center;

public :
    void setR(int radius){
        R = radius;
    }

    void setCenter(Point p){
        center = p;
    }

    int getR(){
        return R;
    }

    Point getCenter(){
        return center;
    }
};


// 判断点和圆的关系
void isInCircle(Circle& c , Point& p){
    int distance = 
    (c.getCenter().getX() - p.getX()) * (c.getCenter().getX() - p.getX()) + 
    (c.getCenter().getY() - p.getY()) * (c.getCenter().getY() - p.getY());

    int R2 = c.getR() * c.getR();

    if(distance < R2){
        cout << "点在圆内" << endl;
    }else if(distance == R2){
        cout << "点在圆上" << endl;
    }else{
        cout << "点在圆外" << endl;
    }
}

int main(){
    Circle c;
    c.setR(10);
    Point center;
    center.setX(10);
    center.setY(0);
    c.setCenter(center);

    Point p1;
    p1.setX(10);
    p1.setY(11);

    isInCircle(c,p1);
    return 0;
}