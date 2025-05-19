package sub2.test;

/*
출력 결과

Artist [name=레오나르도 다빈치, country=이탈리아, birth=1452]
Artist [name=미켈란젤로, country=이탈리아, birth=1475]
Artist [name=빈센트 반 고흐, country=네덜란드, birth=1853]
Artist [name=클로드 모네, country=프랑스, birth=1840]
Artist [name=파블로 피카소, country=스페인, birth=1881]
 */

class Artist {
    public String name;
    public String country;
    public int birth;

    // 위에 변수 초기화 해주는 역할 (생성자 생성)
    public Artist(String name, String country, int birth) {
        this.name = name;
        this.country = country;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Artist [name=" + name + ", country" + country + ", birth" + birth + "]";
    }
}
public class Test06 {
    public static void main(String[] args) {
        Artist[] famousArts = {
                new Artist("레오나르도 다빈치", "이탈리아", 1452),
                new Artist("미켈란젤로", "이탈리아", 1475),
                new Artist("빈센트 반 고흐", "네덜란드", 1853),
                new Artist("클로드 모네", "프랑스", 1840),
                new Artist("파블로 피카소", "스페인", 1881)
        };
        for (Artist art : famousArts) {
            System.out.println(art);  // toString이 호출됨
        }
    }
}
