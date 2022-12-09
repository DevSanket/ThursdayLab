package sanketscode;


class MyQuestion {

public static void main(String s[]) {

try {

for(int i=0;i<5;++i) {

System.out.println(s[i]);

}

}

catch(ArrayIndexOutOfBoundsException e) {

System.out.println("Exception Generated:"+e);

}

finally

{}

}

}