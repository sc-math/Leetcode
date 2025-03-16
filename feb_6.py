grid = [[2,2],[3,4]]

ans = []
num_arr = []

for i in grid:
    for j in i:
        num_arr.append(j)

num_arr.sort()

last_num = 0

a = 0
b = 0

for i in range(len(num_arr)):
    if num_arr[i] == last_num:
        a = num_arr[i]
    if num_arr[i] > last_num+1:
        b = num_arr[i]-1

    last_num = num_arr[i]

if b == 0:
    b = len(num_arr)

ans.append(a)
ans.append(b)

print(num_arr)
print(ans)