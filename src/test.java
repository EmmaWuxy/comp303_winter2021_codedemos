

public class test {
    public static int solution(String G) {
        int rockP = 0;
        int paperP = 0;
        int scissorP = 0;
        char[] arr = G.toCharArray();
        for(char c: arr){
            switch (c){
                case 'R':
                    rockP+=1;
                    paperP+=2;
                    break;
                case 'P':
                    paperP+=1;
                    scissorP+=2;
                    break;
                case 'S':
                    rockP+=2;
                    scissorP+=1;
                    break;
            }
        }
        return Math.max(Math.max(rockP,paperP),scissorP);
    }
    public static void main(String[] args) {
        System.out.println(solution("RSPRS"));
        System.out.println(solution("SRR"));
        System.out.println(solution("PRPRRPP"));
        System.out.println(solution("PPPPRRSSSSS"));
    }
}
