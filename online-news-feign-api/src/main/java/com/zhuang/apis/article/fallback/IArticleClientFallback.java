package com.zhuang.apis.article.fallback;

import com.zhuang.apis.article.IArticleClient;
import com.zhuang.model.article.dtos.ArticleCommentDto;
import com.zhuang.model.article.dtos.ArticleDto;
import com.zhuang.model.comment.dtos.CommentConfigDto;
import com.zhuang.model.common.dtos.PageResponseResult;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.common.enums.AppHttpCodeEnum;
import com.zhuang.model.wemedia.dtos.StatisticsDto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }

    @Override
    public ResponseResult queryLikesAndConllections(Integer id, Date beginDate, Date endDate) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }

    @Override
    public PageResponseResult newPage(StatisticsDto dto) {
        PageResponseResult responseResult = new PageResponseResult(dto.getPage(),dto.getSize(),0);
        responseResult.setCode(501);
        responseResult.setErrorMessage("获取数据失败");
        return responseResult;
    }

    @Override
    public ResponseResult findArticleConfigByArticleId(Long articleId) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }

    @Override
    public PageResponseResult findNewsComments(ArticleCommentDto dto) {
        PageResponseResult responseResult = new PageResponseResult(dto.getPage(),dto.getSize(),0);
        responseResult.setCode(501);
        responseResult.setErrorMessage("获取数据失败");
        return responseResult;
    }

    @Override
    public ResponseResult updateCommentStatus(CommentConfigDto dto) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}
