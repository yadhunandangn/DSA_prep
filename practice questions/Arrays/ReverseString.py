def reverse(arr: list) -> list:
    n = len(arr)
    start = 0
    end = n - 1
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1
    return arr

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5, 6]
    print("Original array:", arr)
    reversed_arr = reverse(arr)
    print("Reversed array:", reversed_arr)
