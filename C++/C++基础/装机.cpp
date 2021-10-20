#include <iostream>
using namespace std;

class CPU{
public:
    virtual void calculate() = 0;

    virtual ~CPU(){
        cout << "CPU回收中" << endl;
    };
};

class VideoCard{
public:
    virtual void display() = 0;

    virtual ~VideoCard(){
        cout << "显卡回收中" << endl;
    }
};

class MemoryCard{
public:
    virtual void storage() = 0;

    virtual ~MemoryCard() {
        cout << "内存卡回收中" << endl;
    };
};

class InterCPU : public CPU{
public:
    void calculate() {
        cout << "Intel芯片计算中： 1 + 1 = 2" << endl;
    }

    ~InterCPU(){
        cout << "Inter回厂重造" << endl;
    }
};

class AMDCPU : public CPU{
public:    
    void calculate(){
        cout << "AMD芯片计算中：1 + 2 = 3" << endl;
    }

    ~AMDCPU(){
        cout << "AMD芯片重做在卖" << endl;
    }
};

class GeForceCard : public VideoCard{
public:
    void display(){
        cout << "老黄yyds 3080 YYDS" << endl;
    }

    ~GeForceCard(){
        cout << "挖矿翻新中" << endl;
    }
};

class RainbowCard : public VideoCard{
public:
    void display(){
        cout << "七彩虹显卡，贵的一批" << endl;
    }

    ~RainbowCard(){
        cout << "回归咸鱼二手平台" << endl;
    }
};

class KingStonMemory : public MemoryCard{
public:
    void storage(){
        cout << "1T固态硬盘 1000 元，太贵了，但是好用" << endl;
    }

    ~KingStonMemory(){
        cout << "金士顿内存条造假回收中" << endl;
    }
};

class SumsonMemory : public MemoryCard{
public:
    void storage(){
        cout << "存储中：。。。。1T机械硬盘还是非常的好用，但是价格便宜" << endl;
    }
};

class Computer{
public:
    Computer(CPU* c,VideoCard* v , MemoryCard* m){
        this->c = c;
        this->v = v;
        this->m = m;
        cout << "电脑构建成功" << endl;
    }

    void work(){
        cout << "开始工作" << endl;
        c->calculate();
        v->display();
        m->storage();
    }

    ~Computer(){
        delete c;
        delete v;
        delete m;
    }

    CPU* c;
    VideoCard* v;
    MemoryCard* m;    
};

Computer* makeComputer(CPU* c , VideoCard* v , MemoryCard* m){
    Computer* computer = new Computer(c,v,m);
    return computer;
}

void test01(){
    CPU* c = new InterCPU();
    VideoCard* v = new GeForceCard();
    MemoryCard* m = new SumsonMemory();
    Computer* computer1 = makeComputer(c,v,m);

    c = new AMDCPU();
    v = new RainbowCard();
    m = new KingStonMemory();
    Computer* computer2 = makeComputer(c,v,m);
    computer1->work();
    computer2->work();
    delete computer1;
    delete computer2;
}

int main(){
    test01();
    return 0;
}