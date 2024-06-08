package ducktogether.ducktogether.repository;

import ducktogether.ducktogether.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByEmail(String email);
}
