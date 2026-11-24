for d_1 in range(1, 10):
    for d_2 in range(1, 10):
        for d_3 in range(1, 10):
            d_1_squared = d_1 * d_1
            d_2_squared = d_2 * d_2
            d_3_squared = d_3 * d_3
            sum = d_1_squared + d_2_squared + d_3_squared
            whole = (d_1 * 100) + (d_2 * 10) + (d_3)
            if sum == whole:
                print(whole)
