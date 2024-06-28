// 루트(최상단) 패키지는 src

package C03Inheritance.ProtectedTest;

import C03Inheritance.*;
//*을 통해 패키지내에 모든 클래스 import가능
//*을 통해 패키지내에 패키지까지 포함해서 모든 내용 import는 불가능
//즉, impoit java.* 이건 불가.

public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass C1 = new C0304ProtectedClass();
////        default 접근 불가
//        System.out.println(C1.st2);
////        protected 접근 불가
//        System.out.println(C1.st3);

        ProtectedMain p1 = new ProtectedMain();
////        default 접근 불가
//        System.out.println(p1.st2);
//        상속한 객체에서 protected접근가능
        System.out.println(p1.st3);

    }
}
