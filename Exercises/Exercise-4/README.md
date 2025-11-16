# Regular Expression Pattern Testing Program

## Design Approach
The program implements 5 independent test methods, each responsible for testing a specific regular expression pattern:

### 1. Email Validation Pattern
- **Pattern**: `^[A-Za-z0-9_.-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,3}$`
- **Purpose**: Validates standard email address format
- **Positive Case**: "zoe5@gmail.com" - contains username, @ symbol, and domain
- **Negative Case**: "jjgd.gmail.com" - missing @ symbol

### 2. Phone Number Pattern
- **Pattern**: `^[0-9]{10}$`
- **Purpose**: Validates 10-digit phone numbers
- **Positive Case**: "0123456789" - exactly 10 digits
- **Negative Case**: "013456789" - only 9 digits

### 3. Date Format Pattern
- **Pattern**: `^[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])$`
- **Purpose**: Validates dates in YYYY/MM/DD format, with months limited to 01-12 and days to 01-31
- **Positive Case**: "1970/01/01" - meets format requirements
- **Negative Case**: "1970-01-01" - uses incorrect separator

### 4. ZIP Code Pattern
- **Pattern**: `^[0-9]{5}(-[0-9]{4})?$`
- **Purpose**: Validates US ZIP code format (5 digits or 5+4 digits)
- **Positive Case**: "12345-6789" - standard 5+4 format
- **Negative Case**: "123456789" - missing separator

### 5. Password Strength Pattern
- **Pattern**: `^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,20}$`
- **Purpose**: Validates passwords requiring uppercase, lowercase, and numeric characters, with length between 8-20 characters
- **Positive Case**: "Yojkl6789" - meets all requirements
- **Negative Case**: "123456789" - missing letters

## How to Run
Compile and run the main class `RegexPattern`. The program will automatically execute all 5 test methods and display the results.