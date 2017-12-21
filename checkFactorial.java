boolean checkFactorial(int n) {
    int k = 1;
    int i = 2;
    
    while(k != n && i <= n){
        k *= i;
        i++;
    }
    if(k == n){
        return true;
    }
    return false;
}
