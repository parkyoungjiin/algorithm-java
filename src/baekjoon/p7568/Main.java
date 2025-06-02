package baekjoon.p7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Main {
    static ArrayList<Human> human_lst = new ArrayList<>();
    static ArrayList<Integer> rank_lst = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String [] input = br.readLine().split(" ");
            int h = Integer.parseInt(input[0]);
            int w = Integer.parseInt(input[1]);

            Human human = new Human(h ,w);

//            Map<Integer, Integer> humans = new HashMap<>();
//            humans.put(h, w);

//            human_lst = new ArrayList<>();
//            rank_lst = new ArrayList<>();

            human_lst.add(human);


        }//for

        //비교
        int rank = 1;

        for (int j = 0; j < n; j++) {
            Human h1 = human_lst.get(j);

            for (int k = 0; k < n; k++) {
                Human h2 = human_lst.get(k);
                //키, 몸무게 비교
                if (h1.height < h2.height && h1.weight < h2.weight) {
                    rank += 1;
                }
            }//for k
            rank_lst.add(j, rank);
            rank = 1;
        }//for j


        for (int q = 0; q < n; q++) {
            Integer answer = rank_lst.get(q);
            System.out.print(answer + " ");

        }



    }
    static class Human{
        int height;
        int weight;

        //생성자
        public Human(int h, int w){
            this.height = h;
            this.weight = w;
        }

    }
}


