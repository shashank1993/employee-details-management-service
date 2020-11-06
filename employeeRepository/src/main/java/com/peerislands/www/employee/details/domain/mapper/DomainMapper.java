package com.peerislands.www.employee.details.domain.mapper;

public class DomainMapper<Source, Target> {

    IMapper<Source, Target> toDomainMapper;

    IMapper<Target, Source> fromDomainMapper;

    public DomainMapper(IMapper<Source, Target> toDomainMapper, IMapper<Target, Source> fromDomainMapper) {
        this.toDomainMapper = toDomainMapper;
        this.fromDomainMapper = fromDomainMapper;
    }

    public Target toDomain(Source source) {

        return toDomainMapper.map(source);
    }

    public Source fromDomain(Target target) {
        return fromDomainMapper.map(target);
    }

}
