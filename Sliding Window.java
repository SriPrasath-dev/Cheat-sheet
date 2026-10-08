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


int left = 0;

for(int right = 0; right < arr.length; right++)
{
    // add arr[right]

    while(condition)
    {
        // update answer

        // remove arr[left]
        left++;
    }
}
