package com.iwhalecloud.client.api;


import com.iwhalecloud.client.model.dto.AuthorityDTO;
import com.iwhalecloud.client.model.param.AuthoritySaveParam;
import com.iwhalecloud.client.model.query.AuthorityQuery;

import java.util.List;

/**
 * AuthorityService
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
public interface AuthorityService {

    AuthorityDTO detailAuthority(AuthorityQuery authorityQuery);

    void saveAuthority(AuthoritySaveParam authoritySaveParam);

    void deleteAuthority(Long id);

    List<AuthorityDTO> listByRoleId(Long roleId);
}
