class leftRightDifference {
  public static void main(String[] args) {
    int nums[] = { 10, 4, 8, 3 };

    int n = nums.length;
    int ans[] = new int[n];

    int leftArr[] = new int[n];
    int left = 0;
    for (int i = 0; i < n; i++) {
      leftArr[i] = left;
      left += nums[i];
    }

    System.out.print("Left Array: ");

    for(int i=0;i<n;i++){
    System.out.print(leftArr[i]+" ");
    }

    System.out.println();

    int rightArr[] = new int[n];
    int right = 0;
    int r = 1;
    for (int i = n - 1; i >= 0; i--) {
      rightArr[i] = right;
      right += nums[n - r];
      r++;
    }

    System.out.print("Right Array: ");
    for(int i=0;i<n;i++){
    System.out.print(rightArr[i]+" ");
    }

    for (int i = 0; i < n; i++) {
      ans[i] = Math.abs(leftArr[i] - rightArr[i]);
    }

    System.out.println();
    System.out.print("left & Right Sum Difference Array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i]+" ");
    }

  }
}