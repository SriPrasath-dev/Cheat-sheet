int left = 0;
int sum = 0;
int minLength = Integer.MAX_VALUE;

for(int right = 0; right < arr.length; right++)
{
    sum += arr[right];

    while(sum >= target)
    {
        minLength = Math.min(minLength, right - left + 1);

        sum -= arr[left];
        left++;
    }
}


int[] arr = {2, 1, 5, 1, 3, 2};
int k = 3;

int sum = 0;
int max = 0;

for(int i = 0; i < k; i++)
{
    sum += arr[i];
}

max = sum;

for(int i = k; i < arr.length; i++)
{
    sum = sum - arr[i-k] + arr[i];

    max = Math.max(max, sum);
}

System.out.println(max);
