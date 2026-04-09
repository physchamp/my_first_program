def calculate_bonus(salary):
    result = salary * 15 / 100   # magic numbers
    print("Calculating bonus...")  # unnecessary print
    print("Salary is:", salary)    # unnecessary print
    return result


def main():
    

    bonus = calculate_bonus(1000)
    print("Bonus:", bonus)

    bonus2 = calculate_bonus(2000)  # duplicate logic
    print("Bonus2:", bonus2)

    


if __name__ == "__main__":
    main()

