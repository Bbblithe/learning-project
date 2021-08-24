#include <iostream>
#include <ctime>
using namespace std;
#define S 5
#define T 3

struct Student{
    string name;
    int score;
};

struct Teacher{
    string name;
    Student students[5];
};

void allocateSpace(Teacher teachers[]){
    string nameSeed = "ABCDE";
    for(int i = 0 ; i < T ; i++){
        teachers[i].name = "Teacher_";
        teachers[i].name += nameSeed[i];
        for(int j = 0; j < S ; j ++){
            teachers[i].students[j].name = "Student_" ;
            teachers[i].students[j].name += nameSeed[j];
            teachers[i].students[j].score = (rand()%100);
        }
    }
}

// 打印老师以及所交学生信息
void printInfo(Teacher teachers[]){
    for(int i = 0 ; i < T; i ++){
        cout << "老师姓名：" << teachers[i].name << endl;
        for(int j = 0 ; j < S ; j ++){
            cout << '\t' <<"学生名字" << teachers[i].students[j].name << " 考试分数" << teachers[i].students[j].score << endl;
        }
    }
}

int main(){
    // 随机数种子
    srand((unsigned int)time(NULL));
    Teacher ts[3];
    allocateSpace(ts);
    printInfo(ts);
    return 0;
}