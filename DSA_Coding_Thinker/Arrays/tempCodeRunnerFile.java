
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) { // Input the Elements of the Array
        arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println(); 

        System.out.print("Which Sliding Window to find the Max_Sum: ");
        int k=sc.nextInt();

        int multy=1;
        for(int i=0;i<k;i++){
            multy*=arr[i];
        }
