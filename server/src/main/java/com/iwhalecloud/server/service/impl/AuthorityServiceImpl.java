package com.iwhalecloud.server.service.impl;

import com.iwhalecloud.client.api.AuthorityService;
import com.iwhalecloud.client.model.dto.AuthorityDTO;
import com.iwhalecloud.client.model.param.AuthorityParam;
import com.iwhalecloud.client.model.param.AuthoritySaveParam;
import com.iwhalecloud.client.model.query.AuthorityQuery;
import com.iwhalecloud.server.domain.AuthorityDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityDomain authorityDomain;

    @Override
    public AuthorityDTO detailAuthority(AuthorityQuery authorityQuery) {
        AuthorityDTO authorityDTO = authorityDomain.detailAuthority(authorityQuery);
        return authorityDTO;
    }

    @Override
    public void saveAuthority(AuthoritySaveParam authoritySaveParam) {
        authorityDomain.saveAuthority(authoritySaveParam);
    }

    @Override
    public void deleteAuthority(Long id) {
        authorityDomain.deleteAuthority(id);
    }

    @Override
    public List<AuthorityDTO> listByRoleId(Long roleId) {
        return authorityDomain.listByRoleId(roleId);
    }
}
