public class FrequencyArrayProblem {

    public static int[] MakeFrequencyArray(int[] arr){

        int[] freq = new int[100001];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        return freq;
    }

    
    public static void main(String[] args) {

        int[] arr = TemplateD.input();

        System.out.print("Enter No. of Queries : ");

        int q = TemplateD.InputInt();

        int[] freq = MakeFrequencyArray(arr);

        while(q-->0){

            System.out.print("Enter the Number to be searched : ");

            int x = TemplateD.InputInt();

            if(freq[x]>0)   System.out.println("Yes");

            else    System.out.println("No");

        }


    }
}
