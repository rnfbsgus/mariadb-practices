-- 함수: 수학alter

-- abs (절대값)
select abs(-1), abs(1);

-- mod (나머지 값 출력)
select mod(10, 3);

-- floor (x 보다 크지않은 값을 정수로 출력)
select floor(3.14);

-- ceil (x 보다 작지 않은 값을 정수로 출력)
select ceil(3.14);
select ceiling(3.14);

-- round(x) : x에 가장 근접한 정수
-- round(x, d): x 값 중에 소수점 d자리에서 가장 근접한 실수
select round(1.498), round(1.498, 1), round(1.498, 0);

-- pow(x,y), power(x,y) x의 y승
select pow(2, 10), power(10,2);

-- sign(x) 양수(1) 음수(-1) 0 판단
select sign(20), sign(-100), sign(0);

-- greatest(x,y, .....) -> 최대값 , least(x, y, .....) -> 최소값, 문자열도 비교 가능
select greatest(10,40, 20, 30) , least(10 ,20 ,30, 40);
select greatest('b', 'A', 'C') , greatest('hello', 'hellp', 'hellq');