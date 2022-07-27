package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */

public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    //싱글톤
    private static final MemberRepository instance = new MemberRepository();

    //싱글톤에 맞게 private으로 생성자 생성
    //왜?
    private MemberRepository(){
    }

    //MemberRepository의 getInstance()를 통해서 instance객체 확인 가능.
    public static MemberRepository getInstance() {
        return instance;
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        //store의 값들을 전부 꺼내 새로운 ArrayList에 담아서 return
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
