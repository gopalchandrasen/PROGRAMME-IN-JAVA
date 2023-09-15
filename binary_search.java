public class binary_search {
    int j[];
    int b_search(int arr[], int size,int data)
    {
        int end=size;
        int beg=0;
        static int flag=0;
        while(beg<=end) 
        {
            int mid=(beg+end)/2;
            if (arr[mid]==data)
            {
                System.out.println(arr[mid]+" data is found and loc :"+mid);
                flag=1;
                break;

            }
            else
            {
                if(data<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    beg=mid+1;
                }
            }
    }
    return flag;
}
    public static void main(String[] args) {
        int  list[]={1,2,3,4,5,6,7,8,9,10};
        // list=new int[10];
        int len=list.length;
        int item=11;
        binary_search b1=new binary_search();
        int r=b1.b_search(list, len, item);
        if(binary_search.flag==1)
        {
            
        }

        
        
    }
    
    
}
