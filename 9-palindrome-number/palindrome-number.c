bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    int rem;
    double rev = 0;
    int org =x;
    while(x!=0){
        rem = x%10;
        rev = rev*10+rem;
        x = x/10;
    }
    if(org==rev){
        return true;
    }
    else{
        return false;
    }
}