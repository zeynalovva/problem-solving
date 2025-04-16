class Solution {
public:
    int nthUglyNumber(int n) {
        int primes[] = {2, 3, 5};
        priority_queue<long long, vector<long long>, greater<long long>>v;
        set<long long>s;
        v.push(1);
        s.insert(1);
        long long min;
        for(int i = 0;i<n;i++){
            min = v.top();
            v.pop();
            for(int j = 0;j<3;j++){
                long long num = min*primes[j];
                if(!s.count(num)){
                    s.insert(num);
                    v.push(num);
                }
            }
        }
        return (int)min;


    }
};