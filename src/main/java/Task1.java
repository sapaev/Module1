public class Task1 {
    public static void main(String[] args) {

                int[] array=new int[]{45, 8, 8, 9, 9, 74, 9};
                int a=uniqueCount(array);
                System.out.println(a);


            }


            static int uniqueCount(int[] array) {
                int result = 0;
                int countUnique = 0;
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    countUnique++;
                    for (int j = i+1; j < array.length; j++)
                    {
                        if (array[j] == array[i])
                        {
                            count++;
                            break;
                        }
                    }
                }
                return result = countUnique - count;
            }
        }



