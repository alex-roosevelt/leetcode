import java.util.Arrays;

void main () {
  candy(new int[]{1,3,2,2,1});
  candy(new int[]{1,2,2});
}

public int candy(int[] ratings) {
  int[] candies = new int[ratings.length];
  Arrays.fill(candies, 1);

  for (int i = 1; i < ratings.length; i++) {
    if (ratings[i] > ratings[i - 1]) {
      candies[i] = candies[i - 1] + 1;
    }
  }

  for (int i = ratings.length - 2; i >= 0 ; i--) {
    if(candies[i] >= candies[i + 1]) {
      candies[i] = Math.max(candies[i], candies[i + 1] + 1);
    }
  }


  System.out.println(Arrays.toString(candies));
  return sum(candies);
}

private int sum(int[] array) {
  int sum = 0;
  for (int i = 0; i < array.length; i++) {
    sum += array[i];
  }
  return sum;
}