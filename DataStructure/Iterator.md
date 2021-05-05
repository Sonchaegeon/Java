# Collection 요소를 순회하는 Iterator

## 요소의 순회란?
- 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
- 순서가 있는 List 인터페이스의 경우는 Iterator를 사용하지 않고 get(i) 메서드를 활용할 수 있음
- Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함

## Iterator 사용하기
- boolean hasNest(): 이후에 요소가 더 있는지를 체크하는 메서드. 요소가 있다면 true를 반환
- E next(): 다음에 있는 요소를 반환