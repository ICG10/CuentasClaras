package com.cuentasclaras.group.service;

import com.cuentasclaras.group.domain.ExpenseGroup;
import com.cuentasclaras.group.domain.GroupMember;
import com.cuentasclaras.group.domain.GroupRole;
import com.cuentasclaras.group.dto.CreateGroupRequest;
import com.cuentasclaras.group.dto.GroupResponse;
import com.cuentasclaras.group.repository.ExpenseGroupRepository;
import com.cuentasclaras.group.repository.GroupMemberRepository;
import com.cuentasclaras.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GroupService {

    private static final String DEFAULT_CURRENCY = "EUR";

    private final ExpenseGroupRepository groupRepository;
    private final GroupMemberRepository memberRepository;
    private final UserService userService;

    public GroupService(ExpenseGroupRepository groupRepository,
                        GroupMemberRepository memberRepository,
                        UserService userService) {
        this.groupRepository = groupRepository;
        this.memberRepository = memberRepository;
        this.userService = userService;
    }

    @Transactional
    public GroupResponse create(CreateGroupRequest request) {
        Long ownerId = request.createdByUserId();
        userService.ensureExists(ownerId);

        ExpenseGroup group = groupRepository.save(
                new ExpenseGroup(request.name(), DEFAULT_CURRENCY, ownerId));
        memberRepository.save(new GroupMember(group, ownerId, GroupRole.OWNER));

        return GroupResponse.from(group);
    }
}