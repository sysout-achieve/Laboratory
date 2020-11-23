# StringBuffer, StringBuilder, String

String : 문자열 연산이 적고 멀티쓰레드 환경에서 사용<br>
StringBuffer : 문자열 연산이 많고, 멀티쓰레드 환경일 경우<br>
StringBuilder : 문자열 연산이 많고, 단일쓰레드 환경이거나 동기화를 고려할 필요가 없는 경우<br>
<br>

사용한다는 글을 보고 실제로 자바에서 어떻게 이 문자열을 연산하는지 확인하기 위한 실험을 함.<br>
단일쓰레드 환경에서 실험하기 때문에 StringBuilder > StringBuffer > String 순으로 성능이 좋을 것이라 예상.<br>
<br>


### StringBuffer<br>
100,000번 반복 변경<br>
HeapMemory -> 272629760<br>
실행 시간 : 0.217sec<br>
1,000,000번 반복 변경<br>
HeapMemory -> 272629760<br>
실행 시간 : 2.947sec<br>
10,000,000번 반복 변경<br>
HeapMemory -> 350224384<br>
실행 시간 : 27.693sec<br>


### StringBuilder <br>
100,000번 반복 변경<br>
HeapMemory -> 272629760<br>
실행 시간 : 0.219sec<br>
1,000,000번 반복 변경<br>
HeapMemory -> 272629760<br>
실행 시간 : 2.586sec<br>
10,000,000번 반복 변경<br>
HeapMemory -> 350224384<br>
실행 시간 : 27.811sec<br>

### String<br>
100,000번 반복 변경<br>
HeapMemory -> 721420288<br>
실행 시간 : 4.393sec<br>


<hr>
String으로 생성된 객체에 문자열을 추가할 경우 새로운 객체로 힙메모리에 저장, 기존의 객체는 메모리에 남아 객체가 쌓이게 됨 (비효율)<br>
String은 불변객체로 사용하기 위해 만들어진 클래스 -> 변경이 아닌 새로운 객체 생성임<br>
<br>

### StringBuffer, StringBuilder는 실험결과에서 크게 차이가 없었음<br>
클래스 내부를 확인해본 결과<br>
StringBuffer는 synchronized 키워드가 포함되어 동시성 문제를 막을 수 있는 가변객체<br>
StringBuilder의 경우 but with no guarantee of synchronization이라는 주석에서 알 수 있듯이 동시성을 고려하지 않은 가변객체임을 확인할 수 있었다.<br>
의도에 맞는 객체를 사용 -> 작성한 코드 의도를 명확하게 보여주는 것이 좋다.<br>
<br>
직접해보지않고 예상한 것을 사실로 받아들이는 것을 경계해야함
