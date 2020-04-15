package jp.co.ha.api.healthinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.ha.business.api.HealthInfoReferenceApi;
import jp.co.ha.business.api.request.HealthInfoReferenceRequest;
import jp.co.ha.business.api.response.HealthInfoReferenceResponse;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.web.controller.BaseJsonController;

/**
 * 健康情報照会コントローラ
 *
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/api/healthinfo/reference")
public class HealthInfoReferenceController extends
        BaseJsonController<HealthInfoReferenceRequest, HealthInfoReferenceResponse> {

    /** 健康情報照会API */
    @Autowired
    private HealthInfoReferenceApi api;

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthInfoReferenceResponse getApiResponse() {
        return new HealthInfoReferenceResponse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(HealthInfoReferenceRequest request,
            HealthInfoReferenceResponse response) throws BaseException {

        api.execute(request, response);

    }

}
