def isSorted(arr : list) -> bool:
    for i in range(1,len(arr)):
        if arr[i-1]>arr[i]:
            return False
    return True

if __name__=="__main__":
    arr=[1,2,3,4,5,6,9,7]
    print(isSorted(arr))
    
