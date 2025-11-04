def max(arr: list) -> int:
    arr.sort
    return arr[len(arr)-1]
if __name__=="__main__":
    arr=[1,2,88,44,56,76,98]
    res = max(arr)
    print(res)