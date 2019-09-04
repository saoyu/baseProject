package com.iwhalecloud.server.domain;

import com.iwhalecloud.client.model.dto.AuthorityDTO;
import com.iwhalecloud.client.model.param.AuthoritySaveParam;
import com.iwhalecloud.client.model.query.AuthorityQuery;
import com.iwhalecloud.server.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Component
public class AuthorityDomain {

    @Autowired
    private AuthorityRepository authorityRepository;
    public void saveAuthority(AuthoritySaveParam authoritySaveParam) {
        authorityRepository.addAuthority(authoritySaveParam);
    }

    public AuthorityDTO detailAuthority(AuthorityQuery authorityQuery) {
        AuthorityDTO authorityDTO = authorityRepository.detailAuthority(authorityQuery);
        return authorityDTO;
    }

    public List<AuthorityDTO> listByRoleId(Long roleId) {
        List<AuthorityDTO> authorityDTOList = authorityRepository.listByRoleId(roleId);
        return authorityDTOList;
    }

    public void deleteAuthority(Long id) {
        authorityRepository.deleteAuthority(id);
    }
}
