def seclargest(arr : list) -> int:
    max=float('-inf')
    sec=float('-inf')
    for i in arr:
        if i > max:
            sec=max
            max=i
        elif i > sec and i != max:
            sec=i
    return sec
if __name__=="__main__":
    arr=[100,76,89,98,93,45,78]
    print(seclargest(arr))