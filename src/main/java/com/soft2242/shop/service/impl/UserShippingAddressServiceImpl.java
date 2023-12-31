package com.soft2242.shop.service.impl;





import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.convert.AddressConvert;
import com.soft2242.shop.vo.AddressVO;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zero
 * @since 2023-11-12
 */
interface UserShoppingAddressService extends IService<AddressConvert.UserShoppingAddress> {
    /**
     * 添加收货地址
     *
     * @param addressVO
     * @return Integer
     */
    Integer saveShoppingAddress(AddressVO addressVO);

    /**
     * 修改收货地址
     *
     * @param addressVO
     * @return Integer
     */
    Integer editShoppingAddress(AddressVO addressVO);

    /**
     * 获取收货地址
     *
     * @param userId
     * @return List
     */
    List<AddressVO> getList(Integer userId);

    /**
     * 收货地址详情
     *
     * @param id
     * @param userId
     * @return AddressVO
     */
    AddressVO getAddress(Integer id, Integer userId);

    /**
     * 删除收货地址
     *
     * @param id
     * @param userId
     * @return Integer
     */
    Integer deleteShoppingAddress(Integer id, Integer userId);
    /**
     *收货地址详情
     *
     * @param id
     * @return
     */
    AddressVO getAddressInfo(Integer id);
    /**
     * 删除收货地址
     *
     * @param id
     */
    void removeShippingAddress(Integer id);
}
