char firstNotRepeatingCharacter(String s) {
    int[] abc = new int[26];
    char curr = 'a';
    int index = 0;
    int min = 10000000;

    for(int i = 0; i < s.length(); i++){
        curr = s.charAt(i);
        index = curr - 'a';

        if(abc[index] == 0){
            abc[index] = i+1;
        }else if(abc[index] > 0){
            abc[index] = 10000000;
        }
    }

    for(int j = 0; j < abc.length; j++){
        System.out.println(abc[j]);
        if(abc[j] < min && abc[j] != 0){
            index = j;
            min = abc[j];
        }
    }

    if(min == 10000000){
        curr = '_';
    }else{
        curr = (char) ('a' + index);
    }
    return curr;
}
